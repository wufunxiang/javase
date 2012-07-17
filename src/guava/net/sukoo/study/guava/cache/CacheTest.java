package net.sukoo.study.guava.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

public class CacheTest {

	private CacheLoader<String, String> tellersLoader = new CacheLoader<String, String>() {
		public String load(String key) {
			return new String("dddd");
		}
	};

	private LoadingCache<String, String> tellerCache = CacheBuilder
			.newBuilder().expireAfterWrite(3, TimeUnit.SECONDS).maximumSize(1)
			.removalListener(new RemovalListener<String, String>() {

				@Override
				public void onRemoval(
						RemovalNotification<String, String> notification) {
					System.out.println(notification.getCause().name());
					System.out.println("«Â≥˝¡À≈∂");

				}

			}).build(tellersLoader);

	@Test
	public void testCache() throws ExecutionException, InterruptedException {
		String xxxx = tellerCache.get("1234");
//		System.out.println(xxxx.hashCode());
//		tellerCache.invalidateAll();
//		TimeUnit.SECONDS.sleep(5);
//		TimeUnit.SECONDS.sleep(5);
		xxxx = tellerCache.get("12345");
		xxxx = tellerCache.get("123456");
		xxxx = tellerCache.get("1234567");
		System.out.println(xxxx.hashCode());
		System.out.println(tellerCache.size());
//		tellerCache.invalidate("1234");
//		tellerCache.invalidateAll();
//		TimeUnit.MINUTES.sleep(5);
	}
}
