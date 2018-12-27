package com.github.aro_tech.extended_mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Interface to facilitate the explicit injection of mocks and stubs
 */
public interface Injector {
    /**
     * Inject via reflection the object -toInject- into the named field of the target objiect
     *
     * @param target
     * @param fieldName
     * @param toInject
     */
    default void injectByName(Object target, String fieldName, Object toInject) throws NoSuchFieldException, IllegalAccessException {
        NoSuchFieldException error = null;
        Class<?> currentTarget = target.getClass();
        while (null != currentTarget) {
            try {
                final Field field =  currentTarget.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(target, toInject);
                return;
            } catch (final NoSuchFieldException ex) {
                error = ex;
                currentTarget = currentTarget.getSuperclass();
            }
        }
        throw error;
    }

    /**
     * Inject via reflection the objects -toInject- into the target object's fields based on type and alphabetical field name order (Java reflection and compilation provide no guarantee of order)
     * Note that generic typing can not be detected at runtime in the -toInject- parameters, so it's better to inject generic types by name. Matching will be attempted based on the base type
     * @param target
     * @param toInject
     */
    default void injectByType(Object target, Object... toInject) throws IllegalAccessException {
        Class<?> currentTarget = target.getClass();
        List<Field> targetFields = new ArrayList<>();
        while (null != currentTarget) {
            for(Field cur : currentTarget.getDeclaredFields()) {
                targetFields.add(cur);
            }
            currentTarget = currentTarget.getSuperclass();
        }

        Collections.sort(targetFields, (a,b) -> a.getName().compareTo(b.getName()));
        List<Object> objectsToInject = new ArrayList<>();
        for(Object cur: toInject) {
            objectsToInject.add(cur);
        }

        for(Field field: targetFields) {
            if(objectsToInject.isEmpty()) {
                break;
            }
            Iterator<Object> it = objectsToInject.iterator();
            while(it.hasNext()) {
                Object injectee = it.next();
//                Class<?> injecteeClass = injectee.getClass();
                Class<?> targetFieldClass = field.getType();
                if(targetFieldClass.isInstance(injectee)) {
                    field.setAccessible(true);
                    field.set(target, injectee);
                    it.remove();
                    break;
                }
            }
        }
    }
}