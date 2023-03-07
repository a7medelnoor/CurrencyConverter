package com.a7medelnoor.currencyconverter.ui.viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.a7medelnoor.currencyconverter.databinding.FragmentCurrencyBinding
import com.example.currencyconverter.model.RatesModel

class CurrencyFragment : Fragment() {

    private var _binding: FragmentCurrencyBinding? = null
    val binding get() = _binding!!
    private var currencies: ArrayList<RatesModel> = ArrayList()

    private val currencyConverterViewModel: CurrencyConverterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCurrencyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.selectionDropdown.setOnClickListener {

        }
    }

    interface SpinnerSelection {
        fun onSelect(selected: String?)
    }
}