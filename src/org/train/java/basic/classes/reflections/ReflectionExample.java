package org.train.java.basic.classes.reflections;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Created by javat on 3/14/2017.
 */
public class ReflectionExample {

    public static void main(String[] args) {
        Class<?> classExample = ConcreteClass.class;
        System.out.println("Using class operator " + classExample.getCanonicalName());

        try {
            classExample = Class.forName("org.train.java.basic.classes.reflections.ConcreteClass");
            System.out.println("Using forName method " + classExample.getCanonicalName());


            classExample = new ConcreteClass().getClass();
            System.out.println("Using getClass method on object " + classExample.getCanonicalName());

            //for primitive types, wrapper classes and arrays
            Class<?> booleanClass = boolean.class;
            System.out.println(booleanClass.getCanonicalName()); // prints boolean

            Class<?> cDouble = Double.TYPE;
            System.out.println(cDouble.getCanonicalName()); // prints double

            Class<?> twoDStringArray = String[][].class;
            System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]

            Class superClass = classExample.getSuperclass(); // get super class
            System.out.println("Super class " + superClass.getCanonicalName()); // prints super class
            System.out.println("Object super class " + Object.class.getSuperclass()); // prints super class
            System.out.println("Array Super class " + String[][].class.getSuperclass().getCanonicalName()); // prints super class


            System.out.println("Interface class " + classExample.getInterfaces()[0].getClass()); // prints interface class

            Class[] explicitClasses = classExample.getDeclaredClasses();
            System.out.println(Arrays.toString(explicitClasses));

            System.out.println(classExample.getPackage().getName()); //package name

            System.out.println("Class modifier " + Modifier.toString( classExample.getModifiers()));

            TypeVariable[] typeParameters = Class.forName("java.util.Comparator").getTypeParameters();
            for(TypeVariable<?> t : typeParameters)
                System.out.println(t.getName());

            Method[] publicMethods = classExample.getMethods();
            System.out.println(Arrays.toString(publicMethods));

            Constructor<?>[] publicConstructors = classExample.getConstructors();
            System.out.println(Arrays.toString(publicConstructors));

            Field[] publicFields = classExample.getFields();
            System.out.println(Arrays.toString(publicFields));

            Field field = classExample.getField("publicInt");
            System.out.println(field.getName());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
