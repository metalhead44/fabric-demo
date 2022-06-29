package com.nitin.kubernetes.fabricdemo;

import io.fabric8.kubernetes.api.model.NamespaceList;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServiceList;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;


public class FabricDemoAdminApplication {

	public static void main(String[] args) {
		
		try (KubernetesClient client = new DefaultKubernetesClient()) {
			NamespaceList myNs = client.namespaces().list();
			
		      if(myNs != null && myNs.getItems().size()>0) {
		    	   System.out.println("Namespaces "+myNs.getItems().get(0).toString());
		      }		   

//		      ServiceList myServices = client.services().list();
//		      
//		      for(Service service: myServices.getItems() ) {
//		    	  System.out.println("Service data"+service.toString());
//		      }

		      ServiceList myNsServices = client.services().inNamespace("default").list();
		      for(Service service: myNsServices.getItems() ) {
		    	  System.out.println("Service data"+service.getMetadata().getName());
		      }
		}
	}

}
