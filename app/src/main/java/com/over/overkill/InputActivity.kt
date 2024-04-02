package com.over.overkill

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.TestModifierUpdaterLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.over.overkill.ui.theme.OverkillTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Image(
            painter = painterResource(
                id = R.drawable.detect
            ),
            contentDescription = "null",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(

            modifier = Modifier
//               .background(Color.LightGray)
                .fillMaxSize()
                .padding(10.dp),


//           verticalArrangement = Arrangement.Center
            horizontalAlignment = Alignment.CenterHorizontally


        ) {


            Image(
                painter = painterResource(
                    id = R.drawable.anonymous
                ),
                contentDescription = "image",
                Modifier.size(120.dp)
            )



            Text(
                text = "Case File",
                fontSize = 40.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            var name by remember { mutableStateOf(TextFieldValue("")) }

//        TextField(value = name, onValueChange = {name = it})


            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Enter Name") },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person, contentDescription = "null")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Green,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.Green,
                    unfocusedLabelColor = Color.White,
                    focusedLeadingIconColor = Color.Green,
                    unfocusedLeadingIconColor = Color.White
                ),
                textStyle = TextStyle(Color.White)
            )


            Spacer(modifier = Modifier.height(20.dp))


            var email by remember { mutableStateOf(TextFieldValue("")) }

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Enter Email") },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "null")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Green,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.Green,
                    unfocusedLabelColor = Color.White,
                    focusedLeadingIconColor = Color.Green,
                    unfocusedLeadingIconColor = Color.White
                ),

                textStyle = TextStyle(Color.White)

            )



            Spacer(modifier = Modifier.height(20.dp))


            var phone by remember { mutableStateOf(TextFieldValue("")) }

            OutlinedTextField(
                value = phone,
                onValueChange = { phone = it },
                label = { Text(text = "Phone Number") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Call, contentDescription = "null")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Green,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.Green,
                    unfocusedLabelColor = Color.White,
                    focusedLeadingIconColor = Color.Green,
                    unfocusedLeadingIconColor = Color.White
                ),
                textStyle = TextStyle(Color.White)

            )


            Spacer(modifier = Modifier.height(20.dp))


            var password by remember { mutableStateOf(TextFieldValue("")) }

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Build, contentDescription = "null")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Green,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.Green,
                    unfocusedLabelColor = Color.White,
                    focusedLeadingIconColor = Color.Green,
                    unfocusedLeadingIconColor = Color.White
                ),
                textStyle = TextStyle(Color.White)

            )


            Spacer(modifier = Modifier.height(20.dp))

            Row {


                val home = LocalContext.current
                Button(onClick = {
                    home.startActivity(Intent(home, MainActivity::class.java))
                }) {
                    Text(text = "Home")

                }


                val about = LocalContext.current
                Button(onClick = {
                    about.startActivity(Intent(about, AboutActivity::class.java))
                }) {
                    Text(text = "About")

                }


                val image = LocalContext.current
                Button(onClick = {
                    image.startActivity(Intent(image, ImageActivity2::class.java))
                }) {
                    Text(text = "Image")

                }



                val ass = LocalContext.current
                Button(onClick = {
                    ass.startActivity(Intent(ass, AssignmentActivity::class.java))
                }) {
                    Text(text = "Ass")

                }
            }

            Spacer(modifier = Modifier.height(20.dp))


            Text(text = "Created by Phil", color = Color.White)


        }

    }
}





