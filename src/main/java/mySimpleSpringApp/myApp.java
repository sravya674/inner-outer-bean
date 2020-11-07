package mySimpleSpringApp;

import food.meal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {
public static void main(String args[])
{
	ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
	
	meal myNormalMeal = new meal();
	System.out.println("Normal meal :" + myNormalMeal.whatsInThisMeal());
	
	meal mySpringMeal = appContext.getBean("meal",meal.class);
	System.out.println("Spring meal :" + mySpringMeal.whatsInThisMeal());
	
	((FileSystemXmlApplicationContext) appContext) .close();
}
}

