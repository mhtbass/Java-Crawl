package com.head.head.quickstart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by Muhammed Baş 
 *
 */
public class App   
{
    public static void main( String[] args ) throws Exception
    {
    	 
    	ArrayList list = new ArrayList<>();


    	for(int i=1 ;i<=20;i++) {
    		
        final Document document = Jsoup.connect("https://ilan.gov.tr/kategori-arama?currentPage="+i).execute().parse();

        //Elements table = document.select("div.column.col-18 > section.top-ad-list > ul > li");  
        //Elements data1 = table.select("div.inner-item > ul.admin-toolbar > li > div.pop-up");
        
        Elements data1 = document.select("div.pop-up"); 

        
        for(Element row : data1) {
        	
        	final String türü = row.select("div.row > div.column.col-24 > span >strong").text();
            final String data2 = row.select("div.row").get(1).text();
            Element datam = row.select("div.row").get(1);
            
            
   		    
        	String firstFourChars= türü.substring(0, 4);
        	// Türünü kontrol ediyoruz 
   
        	if(firstFourChars.equals("İHAL")){
 
             	Not a = new Not();
             	 
        		Elements ihaleNoCheck= datam.select("div").select("div.column.col-8");
        		int index = ihaleNoCheck.size();
        	
        		
        		for(int j=0;j<index;j++) {
        			
        			String title = ihaleNoCheck.select("span").get(j).text();
        			String acıklama = datam.select("div").select("div.column.col-16 > span").get(j).text();

            		
            		if(title.equals("İhale Kayıt No")) {
            			a.setIhaleNo(acıklama);
            			
            		}else if(title.equals("Niteliği, Türü ve Miktarı")) {
            			a.setIhaleNitelik(acıklama); 
            			
            		}else if(title.equals("İşin Yapılacağı Yer")) {
            			a.setIhaleYer(acıklama);

            		}else if(title.equals("İhale Türü")) {
            			a.setIhaleTür(acıklama);

            		}
            	 
        		}
        		
    			list.add(a);
        		System.out.println(a);

        		
        	}
        	
            
        }


    	}            
    	 
    	
        FileWriter writer = new FileWriter("C:/Users/ryto1/Desktop/ihaleler.txt"); 
        for(Object str: list) {
          writer.write(str + System.lineSeparator());
        }
        writer.close();
      
        
        
    }
    
    
}
