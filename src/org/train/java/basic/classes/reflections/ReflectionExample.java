package org.train.java.basic.classes.reflections;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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


//            classExample = new ConcreteClass().getClass();
            System.out.println("Using getClass method on object " + classExample.getCanonicalName());

            //for primitive types, wrapper classes and arrays
            Class<?> booleanClass = boolean.class;
            System.out.println(booleanClass.getCanonicalName()); // prints boolean

            Class<?> cDouble = Double.TYPE;
            System.out.println(cDouble.getCanonicalName()); // prints double

            Class<?> twoDStringArray = String[][].class;
            System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]

            Class superClass = classExample.getSuperclass(); // get super class

            Class baseClass = Class.forName("org.train.java.basic.classes.reflections.BaseClass");
            System.out.println("Base class super class method " + baseClass.getSuperclass());

            System.out.println("Super class " + superClass.getCanonicalName()); // prints super class
            System.out.println("Object super class " + Object.class.getSuperclass()); // prints super class
            System.out.println("Array Super class " + String[][].class.getSuperclass().getCanonicalName()); // prints super class

            for(Class interfaceClass : String.class.getInterfaces())
            {
                System.out.println("Intreface class name is  " + interfaceClass.getName());
            }

            System.out.println("Interface class " + classExample.getInterfaces()[0].getClass()); // prints interface class

            for(Class classClass : classExample.getDeclaredClasses())
            {
                System.out.println("Declared Classes " + classClass.getName());
                System.out.println("Declared Classes " + Modifier.toString(classClass.getModifiers()));
            }

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
            for(Field field : classExample.getFields())
            {
                System.out.println(field.getName() + " And " + Modifier.toString(field.getModifiers())  + " And " + field.getDeclaringClass().getName());
            }

            for(Field field : classExample.getDeclaredFields())
            {
                System.out.println(field.getName() + " And " + Modifier.toString(field.getModifiers())  + " And " + field.getDeclaringClass().getName());
            }


            for(Field field : classExample.getFields())
            {
                System.out.println(field.getName() + " And " + Modifier.toString(field.getModifiers())  + " And " + field.getDeclaringClass().getName());
            }

            BaseInterface cc = (BaseInterface) classExample.newInstance();
            System.out.println(cc.method2("testing..."));

            Method privateMethod = classExample.getDeclaredMethod("privateMethod",null);
            privateMethod.setAccessible(true);
            System.out.println("Invoking private method .........." + privateMethod.invoke(cc,null));


            BaseInterface cc1 = (BaseInterface) classExample.getConstructors()[1].newInstance(new Integer(10));
            System.out.println(cc1.method2("aaa"));

            Field field = classExample.getField("publicInt");
            System.out.println(field.getName());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
