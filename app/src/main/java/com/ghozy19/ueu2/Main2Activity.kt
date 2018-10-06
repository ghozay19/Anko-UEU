package com.ghozy19.ueu2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
//
//        btnBack.setOnClickListener {
//            startActivity<MainActivity>()
//        }

        linearLayout {
            lparams(width = matchParent, height = matchParent)
            padding = dip(16)
            orientation = LinearLayout.VERTICAL


            var input1 = editText {
                hint = "isi angka"
                inputType = android.text.InputType.TYPE_CLASS_NUMBER
            }.lparams {
                width = matchParent
                height = wrapContent
                margin = dip(16)
            }


            var input2 = editText {
                hint = "isi angka"
                inputType = android.text.InputType.TYPE_CLASS_NUMBER

            }.lparams {
                width = matchParent
                height = wrapContent
                margin = dip(16)
            }

            var hasilAkhir = textView {
                text = "99"
                textSize = 20f
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }.lparams {
                width = matchParent
                height = wrapContent
                margin = dip(16)
            }


            button {
                text = "jumlahkan"

                onClick {

                    if (input1.text.isEmpty()) {
                        input1.setError("nilai bulum di isi")
                    } else if (input2.text.isEmpty()) {
                        input2.setError("nilai belum di isi")
                    } else {

                    var convert1 = input1.text.toString().toDouble()
                    var convert2 = input2.text.toString().toDouble()

                    var hasil = convert1 + convert2
                    toast(hasil.toString())
                    hasilAkhir.setText(hasil.toString())
                    }
                }
            }

            button {
                text = "kurangi"

                onClick {
                    if (input1.text.isEmpty()) {
                        input1.setError("nilai bulum di isi")
                    } else if (input2.text.isEmpty()) {
                        input2.setError("nilai belum di isi")
                    } else {
                        var convert1 = input1.text.toString().toDouble()
                        var convert2 = input2.text.toString().toDouble()

                        var hasil = convert1 - convert2

                        toast(hasil.toString())

                        hasilAkhir.setText(hasil.toString())
                    }
                }
            }

            button {
                text = "bagi"

                onClick {
                    if (input1.text.isEmpty()) {
                        input1.setError("nilai bulum di isi")
                    } else if (input2.text.isEmpty()) {
                        input2.setError("nilai belum di isi")
                    } else {
                        var convert1 = input1.text.toString().toDouble()
                        var convert2 = input2.text.toString().toDouble()

                        var hasil = convert1 / convert2

                        toast(hasil.toString())

                        hasilAkhir.setText(hasil.toString())
                    }
                }
            }

            button {
                text = "Kali"

                onClick {
                    if (input1.text.isEmpty()) {
                        input1.setError("nilai bulum di isi")
                    } else if (input2.text.isEmpty()) {
                        input2.setError("nilai belum di isi")
                    } else {
                        var convert1 = input1.text.toString().toDouble()
                        var convert2 = input2.text.toString().toDouble()

                        var hasil = convert1 * convert2

                        toast(hasil.toString())

                        hasilAkhir.setText(hasil.toString())
                    }
                }
            }

            button {
                text = "Clear All"

                onClick {
                    input1.setText("")
                    input2.setText("")
                    hasilAkhir.setText("")
                }
            }

            button {
                text = "back"

                onClick {
                    startActivity<MainActivity>()
                }
            }

        }


    }
}
