package com.example.ojoquicktalk;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import io.reactivex.rxjava3.annotations.Nullable;

public class TabsAccessorAdapter extends FragmentPagerAdapter {
    public TabsAccessorAdapter(FragmentManager fm)
    {
        super(fm);
    }


    public Fragment getItem(int i)
    {
        switch (i)
        {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1:
                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;

            case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;

//            case 3:
//                RequestsFragment requestsFragment = new RequestsFragment();
//                return requestsFragment;

            default:
                return null;
        }
    }



    public int getCount()
    {
        return 3;
    }




    @Nullable

    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Chats";

            case 1:
                return "Groups";

            case 2:
                return "Contacts";

//            case 3:
//                return "Requests";

            default:
                return null;
        }
    }

}
