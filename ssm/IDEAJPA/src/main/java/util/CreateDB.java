package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by admin on 2017/6/23.
 */
public class CreateDB {
    public static void main(String[] args) {
        System.out.println("初始化数据开始......");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("company");
        emf.close();
        System.out.println("初始化数据完成");
    }
}
