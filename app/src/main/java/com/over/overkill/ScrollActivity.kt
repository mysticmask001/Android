package com.over.overkill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.over.overkill.ui.theme.OverkillTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lazy()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Lazy(){

    LazyColumn (
        modifier = Modifier
    )


    {
        item {
            
            Column {
                Text(text = "Hello World!")
                
                
                Spacer(modifier = Modifier.height(800.dp))
                
                
                Text(text = "Gotcha!")
            }



            
        }
    }



}


