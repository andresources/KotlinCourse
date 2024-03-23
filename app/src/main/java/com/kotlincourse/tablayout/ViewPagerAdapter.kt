package com.kotlincourse.tablayout


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager,val mFragmentList:List<Fragment>,val mFragmentTitleList:List<String>) :
    FragmentStatePagerAdapter(supportFragmentManager) {

    // declare arrayList to contain fragments and its title


    override fun getItem(position: Int): Fragment {
        // return a particular fragment page
        return mFragmentList[position] // 0 ->CallsFragment()  //1 ChatsFragment() // 3UpdatesFragment()
    }

    override fun getCount(): Int {
        // return the number of tabs
        return mFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence{ //position -1
        // return title of the tab
        return mFragmentTitleList[position] //0 ->Calls //1 ->
    }


}