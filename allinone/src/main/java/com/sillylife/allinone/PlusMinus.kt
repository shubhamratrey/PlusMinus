package com.sillylife.allinone

object PlusMinus {
    fun minus (a: Int, b:Int): String{
        return if (a>b){
            (a-b).toString()
        } else {
            (b-a).toString()
        }
    }
}