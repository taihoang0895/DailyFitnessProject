package com.example.repository

import androidx.lifecycle.LiveData
import com.example.data.complex.*
import com.example.data.primary.*
import com.example.repository.exceptions.ObjectNotFound

interface DataHelper {
    fun getUser(): LiveData<User>
    suspend fun save(user: User): Boolean

    fun fetchWorkoutGroupCourses(): LiveData<ListWorkoutGroups>

    fun fetchListWorkoutSuggestion(
        offset: Int = 0,
        limit: Int = -1
    ): LiveData<ListWorkouts>

    fun fetchListRecentWorkout(
        offset: Int = 0,
        limit: Int = -1
    ): LiveData<ListWorkouts>

    fun fetchAndGroupRecentChallenges(): LiveData<ListChallengeGroup>

    fun fetchRecentChallenges(
        offset: Int = 0,
        limit: Int = -1
    ): LiveData<ListChallenges>

    fun fetchAndGroupChallenges(): LiveData<ListChallengeGroup>

    fun fetchChallenges(
        offset: Int = 0,
        limit: Int = -1
    ): LiveData<ListChallenges>

    @Throws(ObjectNotFound::class)
    fun getWorkoutGroupByTag(tag: Tag): LiveData<WorkoutGroup>

    @Throws(ObjectNotFound::class)
    fun getWorkout(id: Int): LiveData<Workout>

    fun download(workout: Workout): LiveData<DownloadInfo>

    @Throws(ObjectNotFound::class)
    fun getChallenge(id: Int): LiveData<Challenge>

    fun download(dailyChallenge: DailyChallenge): LiveData<DownloadInfo>

    suspend fun createMyPlan(title: String, description: String, exercises: List<Exercise>): Workout

    suspend fun saveMyPlan(plan: Workout): Boolean

    suspend fun deleteMyPlan(plan: Workout): Boolean

    suspend fun duplicateMyPlan(plan: Workout): Boolean

    fun fetchMyPlan(): LiveData<ListWorkouts>

    fun fetchMyHistory(fromDate: Long, endDate: Long): LiveData<ListWorkoutHistory>
    fun fetchMyHistory(days: Int): LiveData<ListWorkoutHistory>

    suspend fun save(workoutHistory: WorkoutHistory): Boolean

}