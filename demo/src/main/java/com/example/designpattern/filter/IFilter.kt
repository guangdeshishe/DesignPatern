package com.example.designpattern.filter

/**
 * TODO 请添加说明
 *
 * @author zhujie
 * @date 2019/8/28
 * @time 19:20
 */
interface IFilter {
    fun filter(persons: ArrayList<Person>): ArrayList<Person>
}