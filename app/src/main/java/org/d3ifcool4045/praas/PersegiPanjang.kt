package org.d3ifcool4045.praas


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool4045.praas.databinding.FragmentPersegiPanjangBinding

private const val ARG_PARAM1="parameter1"
private const val ARG_PARAM2="parameter2"

/**
 * A simple [Fragment] subclass.
 */
class PersegiPanjang : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_persegi_panjang,container,false)
        binding.buttonHitsegitiga.setOnClickListener{
            var panjang = binding.editTextPanjang.text.toString().toDouble()
            var lebar = binding.editTextLebar.text.toString().toDouble()
            var hasilLuas = panjang * lebar
            var hasilKeliling = (panjang*2)+(lebar*2)

            binding.textHasilLuas.text = "$hasilLuas"
            binding.textHasilKeliling.text = "$hasilKeliling"
        }
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
    }


}
