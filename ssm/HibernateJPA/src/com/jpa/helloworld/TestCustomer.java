package com.jpa.helloworld;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by admin on 2017/6/16.
 */
public class TestCustomer {
    public static void main(String[] args) {

        /*
         * 1、获取EntityManagerFactory实例
         * 利用Persistence类的静态方法，结合persistence.xml中
         * persistence-unit标签的name属性值得到
         */
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("NewPersistenceUnit");

        // 2、获取EntityManager实例
        EntityManager em = emf.createEntityManager();

        // 3、开启事物
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        // 4、调用EntityManager的persist方法完成持久化过程
//        TCustomerEntity customer = new TCustomerEntity();
//        customer.setAge(9);
//        customer.setEmail("Tom@163.com");
//        customer.setLastName("Tom");
//        em.persist(customer);
        Student stu = new Student();
        stu.setClassName("3年2班");
        stu.setName("凤梨酥");
        em.persist(stu);
        // 5、提交事物
        transaction.commit();
        // 6、关闭EntityManager
        em.close();
        // 7、关闭EntityManagerFactory
        emf.close();

    }

}
