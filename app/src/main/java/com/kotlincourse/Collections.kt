package com.kotlincourse

fun main(){ //list,set,map

    //1.Read Only list using listOf()
    var readOnlyGenericList = listOf("Abc",1,1.5f,'c',false)
    var readOnlyStringList = listOf<String>("a","b","c","a")

    for (item in readOnlyStringList){
        //println(item)
    }

    //2.Read & Write list using mutableListOf()
    var read_writeGenericList = mutableListOf("Abc","1",1.5f,'c',false)
    read_writeGenericList.add("xyz")
    read_writeGenericList.addAll(readOnlyStringList)

    for (item in read_writeGenericList){
         //println(item)
    }

    //3.Read Only set using setOf()
    var readOnlyGenericSet = setOf("Abc",1,1.5f,'c',false)
    for (item in readOnlyGenericSet){
        //println(item)
    }

    //4.Read Write set using mutableSetOf()
    var readWriteGenericSet = mutableSetOf("Abc",1,1.5f,'c',false)
    readWriteGenericSet.add("Abc") //not added to set
    readWriteGenericSet.add(1) //not added to set
    readWriteGenericSet.add(true) //added to set
    for(item in readWriteGenericSet){
        println(item)
    }
    //5. readOnlyGenericMap
    var readOnlymap = mapOf(0 to "Abc",1 to false, 2 to true)
    for(item in readOnlymap.values){
        println(item)
    }
    //6.read & write map
    var readwritemap = mutableMapOf<Int,String>(0 to "Abc",1 to "tt", 2 to "dddd")
    readwritemap.put(3 , 1.5f.toString())
    for(item in readwritemap.values){
        println(item)
    }
}