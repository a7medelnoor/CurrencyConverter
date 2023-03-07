package com.a7medelnoor.currencyconverter

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.a7medelnoor.currencyconverter.databinding.ActivityMainBinding
import com.a7medelnoor.currencyconverter.ui.viewmodel.CurrencyConverterViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val currencyViewModel: CurrencyConverterViewModel by viewModels()
    private val TAG = "MainActivity"
    private var selectedItem1: String? = "AED"
    private var selectedItem2: String? = "USD"

    private var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        // get the currency
        currencyViewModel.getCurrency()
        initSpinner()
        doConversion()


    }

    private fun doConversion() {
        val from = selectedItem1.toString()
        val to = selectedItem2.toString()
        observeUI()
    }

    private fun observeUI() {
        lifecycleScope.launch {
            currencyViewModel.currency.collect {
                var rateFromAmount = it?.rates
                binding.fromTextView.text = it.toString()
            }
        }
    }

    private fun initSpinner() {

        val spinnerFrom = binding.spinnerFrom
        spinnerFrom.setItems(setSpinnerData())
        spinnerFrom.setOnItemSelectedListener { view, position, id, item ->
        }
        val spinnerTo = binding.spinnerTo

    }

    private fun setSpinnerData(): java.util.ArrayList<String> {
        val rates = ArrayList<String>()
        val remoteRates = currencyViewModel.currency.value?.rates
        for (i in remoteRates.toString()) {
            rates.add(i.toString())
        }
        rates.sort()
        return rates
    }

}