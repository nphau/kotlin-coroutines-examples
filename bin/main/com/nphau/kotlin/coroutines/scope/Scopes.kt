/*
 * Created by nphau on 29/12/2021, 10:27
 * Copyright (c) 2021 . All rights reserved.
 * Last modified 29/12/2021, 10:26
 */

package com.nphau.kotlin.coroutines.scope

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    exampleDefaultScope()
}

private suspend fun sampleAsyncTask(iteration: Int): Int {
    delay(3000L / iteration)
    println("[Coroutines] Executed iteration: $iteration")
    if (iteration % 2 == 0) {
        throw IllegalStateException()
    }
    return iteration
}

// All tasks after first exception will be cancelled
private fun exampleDefaultScope() = runBlocking {
    coroutineScope {
        launch { sampleAsyncTask(1) }
        launch { sampleAsyncTask(2) }
        launch { sampleAsyncTask(3) }
    }
}
