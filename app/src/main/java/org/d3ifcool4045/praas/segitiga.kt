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
class segitiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_persegi_panjang,container,false)
        binding.buttonHitsegitiga.setOnClickListener{
            var alas = binding.editTextPanjang.text.toString().toDouble()
            var tinggi = binding.editTextLebar.text.toString().toDouble()
            var hasilLuas = alas * tinggi
            var hasilKeliling = alas+tinggi

            binding.textHasilLuas.text = "$hasilLuas"
            binding.textHasilKeliling.text = "$hasilKeliling"
        }
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
    }


}
