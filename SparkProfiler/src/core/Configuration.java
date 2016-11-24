package core;

public class Configuration {
	
	public static int workerNumbers;
	public static int workerCores;
	public static int workerMemory;
	public static int executorCoresLimit;
	public static int profilerInputSize;
	public static String profilerLevel;
	public static String sparkHome;
	public static String inputPath;
	public static String applicationJar;
	public static String applicationClass;
	public static String outputPath;
	
	public static void printConfig()
	{
		System.out.println("Total Worker Nodes="+workerNumbers);
		System.out.println("Cores in Each Worker="+workerCores);
		System.out.println("Memory in Each Worker="+workerMemory+"GB");
		System.out.println("Maximum Cores Limit per Executor="+executorCoresLimit);
		System.out.println("Profiler Input Size="+profilerInputSize+"GB");
		System.out.println("Profiler Level="+profilerLevel);
		System.out.println("Spark Home="+sparkHome);
		System.out.println("InputPath="+inputPath);
		System.out.println("Application Jar="+applicationJar);
		System.out.println("Application Class="+applicationClass);
		System.out.println("OutputPath="+outputPath);
	}
}
