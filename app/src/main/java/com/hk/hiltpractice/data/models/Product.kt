package com.hk.hiltpractice.data.models

import javax.inject.Inject

class Product @Inject constructor(val user: User)