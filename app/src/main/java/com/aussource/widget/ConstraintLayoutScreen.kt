package com.aussource.widget

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
 fun ConstraintLayoutContent() {

    ConstraintLayout {
        val (buttonRef, textRef) = createRefs()
        Button(onClick = {}, modifier = Modifier.constrainAs(buttonRef)
        {
            top.linkTo(
                parent.top, margin = 16.dp
            )
        }) {
            Text(text = "Test Button")
        }
        Text(text = "This is dummy text", modifier = Modifier.constrainAs(textRef) {
            top.linkTo(buttonRef.bottom, margin = 16.dp)

        })
    }
}