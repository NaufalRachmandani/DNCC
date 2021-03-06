package com.dncc.dncc.domain.entity.user

import android.os.Parcelable
import com.dncc.dncc.common.UserRoleEnum
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserEntity(
    val userId: String = "",
    val email: String = "",
    val fullName: String = "",
    val major: String = "",
    val nim: String = "",
    val noHp: String = "",
    val role: String = UserRoleEnum.VISITOR.role,
    val training: String = "",
    val trainingId: String = ""
) : Parcelable
