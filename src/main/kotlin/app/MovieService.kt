package app

import org.slf4j.LoggerFactory
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

object MovieService {
  private val log = LoggerFactory.getLogger(MovieService.javaClass)

  fun getMoviesLatest(): String {
    return "https://api.themoviedb.org/3/movie/latest?api_key=94884da516a196359c26abe0c0e3ea46".httpGet().responseString().third.get()
  }

  init {
    
  }
}
