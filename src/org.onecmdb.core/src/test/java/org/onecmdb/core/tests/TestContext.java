package org.onecmdb.core.tests;

import junit.framework.TestCase;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.onecmdb.core.IOneCmdbContext;
import org.onecmdb.core.utils.SpringFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tom on 2016/12/26.
 */
public class TestContext extends TestCase{
    public void testFactory(){
        String[] resources = {
                "onecmdb-basic.xml","providers/empty-provider.xml"

        };
        ApplicationContext appContext = new ClassPathXmlApplicationContext(resources);

        IOneCmdbContext iOneCmdbContext = (IOneCmdbContext) appContext
                .getBean("onecmdb");

        SessionFactory sessionFactory = (SessionFactory) appContext.getBean("mySessionFactory");

        System.out.println(sessionFactory.openSession());
    }
}
