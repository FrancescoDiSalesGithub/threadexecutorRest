package com.thread.poolthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoolController 
{
	
	private ExecutorService service = null;
	private ExecutorService service2 = null;
	
	
	@GetMapping("start")
	public void startDemo()
	{
		service = Executors.newFixedThreadPool(1);
		service.execute(new ThreadDummy());
	}
	
	@GetMapping("start2")
	public void startDemo2()
	{
		service2 = Executors.newFixedThreadPool(1);
		service2.execute(new ThreadDummy());
	}
	
	@GetMapping("stop")
	public void stopDemo()
	{
		service.shutdownNow();
		service2.shutdownNow();
	}

}
