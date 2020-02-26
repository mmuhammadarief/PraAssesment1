package org.d3ifcool4045.praas


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import org.d3ifcool4045.praas.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class Main : Fragment() {
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        binding.frameLayout.setOnClickListener{
            it.findNavController().navigate(R.id.action_main_to_segitiga)
        }
        binding.frameLayout.setOnClickListener{
            it.findNavController().navigate(R.id.action_main_to_persegiPanjang)

        }


        return binding.root
    }


}
