package com.dhsq.barrelled.common;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * Created by jerry on 2017/7/3.
 */
public class ScanService {
    private String sacnPackage;
    private static Map<String,Object> serviceImpls;

    public ScanService (){
        try {
            Enumeration<URL> enumeration= Thread.currentThread().getContextClassLoader().getResources(this.sacnPackage.replace(".","/"));
            List<URL> stringList=new ArrayList<>();
            while (enumeration.hasMoreElements()){
                stringList.add(enumeration.nextElement());
            }
            for (URL root : stringList) {
                Object object=Thread.currentThread().getContextClassLoader().loadClass(root.getPath()).newInstance();
                serviceImpls.put(root.toString(),object);
            }
            ClassLoader.getSystemResource(this.sacnPackage);
        }catch (Exception e){
            e.printStackTrace();
        }
        }
}
