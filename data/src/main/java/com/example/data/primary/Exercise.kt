package com.example.data.primary

enum class TimeUnit {
    STEP,
    DURATION
}

class Exercise(
    id: Int,
    title: String,
    description: String,
    previewImage: String,
    thumbnail: String,
    val kcal: Int = 0,
    val unit: TimeUnit,
    val introduction: TimeSpechMap,
    val listTimeToSpeech: List<TimeSpechMap>

) : Content(id, title, description, previewImage, thumbnail) {
    companion object {
        fun newInstance(
            id: Int,
            title: String,
            description: String,
            previewImage: String,
            thumbnail: String,
            kcal: Int,
            timeUnit: TimeUnit,
            introduction: TimeSpechMap,
            listTimeToSpeech: List<TimeSpechMap>,
            times: Int,
            state: PracticeState,
            completedActionTimes: Int
        ): Exercise {
            val exercise = Exercise(
                id,
                title,
                description,
                previewImage,
                thumbnail,
                kcal,
                timeUnit,
                introduction,
                listTimeToSpeech
            )
            exercise._times = times
            exercise._state = state
            exercise._completedActionTimes = completedActionTimes
            return exercise
        }
    }

    private var _times: Int = 0
    private var _state: PracticeState =
        PracticeState.PENDING
    private var _completedActionTimes: Int = 0

    fun percent(): Int {
        if (_times == 0) {
            return 0
        }
        return (_completedActionTimes * 100) / _times
    }
}