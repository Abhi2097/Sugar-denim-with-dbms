package com.niit.EcommDBMS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.configuration.DBConfiguration;
import com.niit.dao.UserDao;
import com.niit.dao.UserDaoImpl;
import com.niit.models.User;

import com.niit.configuration.DBConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,UserDaoImpl.class);
       // ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
        
        /*Product product=new Product(); //New Product
        product.setProductname("Introduction to Spring framework"); //inserted in the column productname
        product.setProductdesc("2nd Edition"); //column productdesc
        product.setPrice(1000); //column price
        product.setQuantity(10); //column quantity
        //column id =0
        
        productDao.saveProduct(product);to insert product details into a product table*/
        
        UserDao userDao=(UserDao)context.getBean("userDaoImpl");
        User user=new User(); //New Product
        user.setUsername("Pranav"); //inserted in the column productname
        user.setEmail("abc@xyz.com"); //column productdesc
        user.setConfirmpassword("123456"); //column price
        user.setPassword("123456");
        user.setPhoneNumber(526487);
        user.setRoll("primary key");
        user.setEnable("true");
        
        userDao.saveUser(user);//to insert product details into a product table*/
        
        
        
        }

        
 }


