package hede.com.spring_boot_demo.utils;

import java.util.ArrayList;
import java.util.List;

public class ListPageUtil {
	    /**  
	     * 当前页面  
	     */  
	    private int page = 2;  
	  
	    /**  
	     * 显示多少行  
	     */  
	    private int rows = 15;  
	  
	    /**  
	     * 总记录条数  
	     */  
	    private int total;  
	  
	    /**  
	     * @return the page  
	     */  
	    public int getPage() {  
	        return page;  
	    }  
	  
	    /**  
	     * @param page the page to set  
	     */  
	    public void setPage(int page) {  
	        this.page = page;  
	    }  
	  
	    /**  
	     * @return the rows  
	     */  
	    public int getRows() {  
	        return rows;  
	    }  
	  
	    /**  
	     * @param rows the rows to set  
	     */  
	    public void setRows(int rows) {  
	        this.rows = rows;  
	    }  
	  
	    /**  
	     * @return the total  
	     */  
	    public int getTotal() {  
	        return total;  
	    }  
	  
	    /**  
	     * @param total the total to set  
	     */  
	    public void setTotal(int total) {  
	        this.total = total;  
	    }  
	  
	    /**  
	     * 对list集合进行分页处理  
	     *   
	     * @return  
	     */  
	    private List<Person> ListSplit(List<Person> list) {  
	        List<Person> newList=null;  
	        total=list.size();  
	        newList=list.subList(rows*(page-1), ((rows*page)>total?total:(rows*page)));  
	        return newList;  
	    }  
	    
	    class Person{
	    	int age;
	    	String name;
	    	Person(int age,String name){
	    		this.age=age;
	    		this.name=name;
	    	}
			@Override
			public String toString() {
				return "Person [age=" + age + ", name=" + name + "]";
			}
	    }
	    
	    public  List<Person> main() {
	    	List<Person> list = new ArrayList<>();
			for (int i = 1; i <=100; i++) {
				Person person = new Person(i, "test"+i);
				list.add(person);
			}
			List<Person> listSplit = ListSplit(list);
			return listSplit;
		}
	    public static void main(String[] args) {
	    	ListPageUtil pageList = new ListPageUtil();
	    	List<Person> main = pageList.main();
	    	System.out.println(main);
		}
	  
	} 
