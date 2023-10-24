package com.ptit.tuvanptit.utils

import kotlinx.coroutines.CoroutineDispatcher

class AppDispatchers(val main: CoroutineDispatcher, val io: CoroutineDispatcher, val default: CoroutineDispatcher)