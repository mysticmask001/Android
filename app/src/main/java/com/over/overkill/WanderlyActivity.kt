package com.over.overkill

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.over.overkill.ui.theme.OverkillTheme

class WanderlyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Wander()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Wander(){

    Box (
        modifier = Modifier
            .fillMaxSize()
    )
    {


        Image(
            painter = painterResource(
                id = R.drawable.detect
            ),
            contentDescription = "null",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )



        Column (
            modifier = Modifier
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally
            


        ){
            Text(text = "Wanderly", color = Color.White, fontSize = 30.sp,
                
                modifier = Modifier
                    .padding(20.dp)
                    .padding(10.dp)

                )

            Text(
                text = "Your Ultimate Companion for Seamless Travel Experiences",
                color = Color.White,
                fontSize = 20.sp,

                modifier = Modifier
                    .padding(10.dp)



            )
            
            
            Spacer(modifier = Modifier.height(450.dp))


            val Sign = LocalContext.current
            Button(onClick = {
                Sign.startActivity(Intent(Sign, GridActivity::class.java))


            },  colors = ButtonDefaults.buttonColors(Color.DarkGray)
            ) {

                Text(text = "Sign in with Phone Number ", color = Color.White)


            }

            val In = LocalContext.current
            Button(onClick = {
                In.startActivity(Intent(In, GridActivity::class.java))


            },  colors = ButtonDefaults.buttonColors(Color.White),

            ) {

                Image(imageVector = Icons.Default.AccountCircle, contentDescription = null)


                Text(text = "Sign in with Apple", color = Color.Black)


            }

            Text(text = "Don't have an account? Sign Up", color = Color.White)

            Spacer(modifier = Modifier.height(5.dp))


            Text(text = "By creating an account or signing in, you agree to our Terms of Service and Privacy Policy."
            , color = Color.White,
                modifier = Modifier
                    .padding(30.dp))





        }
    }
}


