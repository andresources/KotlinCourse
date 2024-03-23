package com.kotlincourse.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.kotlincourse.R

class TabLayoutActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager // creating object of ViewPager
    private lateinit var tab: TabLayout  // creating object of TabLayout
    private lateinit var bar: Toolbar    // creating object of ToolBar
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        // set the references of the declared objects above
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        // Initializing the ViewPagerAdapter


        // add fragment to the list
        mFragmentList.add(CallsFragment()) //0
        mFragmentList.add(ChatsFragment())  //1
        mFragmentList.add(UpdatesFragment()) //2

        mFragmentTitleList.add("Calls") //0
        mFragmentTitleList.add("Chats") //1
        mFragmentTitleList.add("Updates") //2
        val adapter = ViewPagerAdapter(supportFragmentManager,mFragmentList,mFragmentTitleList)
        // Adding the Adapter to the ViewPager
        pager.adapter = adapter
        pager.currentItem = 2
        // bind the viewPager with the TabLayout.
        tab.setupWithViewPager(pager)

    }
}