package ps.room.gadsleaderboard.api

import ps.room.gadsleaderboard.model.Learners
import ps.room.gadsleaderboard.model.SkilledIQLearners
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getLearningLeaders(): Response<List<Learners>> {
        return apiService.getLearningLeaders()
    }

    override suspend fun getSkillIQLeaders(): Response<List<SkilledIQLearners>> {
        return apiService.getSkillIQLeaders()
    }
}