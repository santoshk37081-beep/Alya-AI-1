package com.example.alyaai

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                            setContentView(R.layout.activity_main)

                                    val promptInput = findViewById<EditText>(R.id.promptInput)
                                            val sendButton = findViewById<Button>(R.id.sendButton)
                                                    val responseText = findViewById<TextView>(R.id.responseText)

                                                            sendButton.setOnClickListener {
                                                                            val userMessage = promptInput.text.toString().trim()
                                                                                        if (userMessage.isNotEmpty()) {
                                                                                                            responseText.text = "Alya AI: मैंने सुना — \"$userMessage\""
                                                                                                                            promptInput.text.clear()
                                                                                        } else {
                                                                                                            responseText.text = "Alya AI: कृपया पहले कुछ लिखें।"
                                                                                        }
                                                            }
        }
}

                                                                                        }
                                                            }
        }
}