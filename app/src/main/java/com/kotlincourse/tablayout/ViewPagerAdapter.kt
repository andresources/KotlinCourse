package com.kotlincourse.tablayout


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager,val mFragmentList:List<Fragment>,val mFragmentTitleList:List<String>) :
    FragmentStatePagerAdapter(supportFragmentManager) {

    // declare arrayList to contain fragments and its title


    override fun getItem(position: Int): Fragment {
        // return a particular fragment page
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        // return the number of tabs
        return mFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence{
        // return title of the tab
        return mFragmentTitleList[position]
    }


}