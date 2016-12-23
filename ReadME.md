OneCMDB is an Open Source CMDB, Configuration Management Database published under GPL Version 2.
Its homepage is: http://www.onecmdb.org/


These projects and Maven scripts

  1. are made by Konca Fung with the purpose of researching and
  1. are made from the source codes package contained in OneCMDB installation folder.
    

Please refer to this blog for the detail about how to compile the source code:

  * http://blog.konca.com/2012/05/13/the-maven-compilation-files-for-onecmdb/

# add lib
> download http://download.oracle.com/otn/java/oc4j/101350/oc4j_extended_101350.zip
> mvn install:install-file -DgroupId=com.oracle.toplink -DartifactId=toplink -Dversion=10.1.3.5 -Dpackaging=jar -Dfile=./toplink.jar