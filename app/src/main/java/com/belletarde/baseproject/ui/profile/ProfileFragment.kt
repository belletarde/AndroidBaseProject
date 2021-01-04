package com.belletarde.baseproject.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.belletarde.baseproject.R
import com.belletarde.baseproject.ui.start.StartFragment

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    companion object {
        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }

}