package com.dncc.dncc.data.source.remote.model

import com.dncc.dncc.domain.entity.training.MeetEntity

data class MeetDto(
    val trainingId: String = "",
    val meetId: String = "",
    val description: String = "",
    val fileDownloadLink: String = "",
    val meetName: String = ""
)

fun MeetDto.toMeetEntity(): MeetEntity {
    return MeetEntity(
        trainingId = trainingId,
        meetId = meetId,
        description = description,
        fileDownloadLink = fileDownloadLink,
        meetName = meetName
    )
}
