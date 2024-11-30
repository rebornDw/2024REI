package thirdhomework;

public class gpu {
	class GPU {
	    String name;  // 显卡名称
	    int memory;  // 显存大小，单位为 GB

	    // 方法
	    public GPU(String name, int memory) {
	        this.name = name;
	        this.memory = memory;
	    }

	    // 获取显卡名称 要reuturn
	    public String getName() {
	        return name;
	    }

	    // 获取显存大小 要reuturn
	    public int getMemory() {
	        return memory;
	    }

	    // 设置显存大小 用this
	    public void setMemory(int memory) {
	        this.memory = memory;
	    }

	    // 重写 toString 方法，输出显卡信息
	    public String toString() {
	        return "显卡: " + name + ", 显存: " + memory + " GB";
	    }
	}

	public class GPUMemorySort {
	    public static void main(String[] args) {
	        // 创建一个 GPU 对象数组
	        GPU[] gpus = new GPU[10];

	        // 定义显卡名称和对应的显存（单位：GB）
	        String[] gpuNames = {
	            "NVIDIA RTX 4050", "NVIDIA RTX 4060", "NVIDIA RTX 4060 Ti", "NVIDIA RTX 4070", 
	            "NVIDIA RTX 4070 Ti", "NVIDIA RTX 4070 TiS", "NVIDIA RTX 4080", "NVIDIA RTX 4080 S", 
	            "NVIDIA RTX 4090", "NVIDIA RTX 4090 D"
	        };
	        
	        int[] gpuMemory = {
	            8,   // RTX 4050
	            8,   // RTX 4060
	            8,   // RTX 4060 Ti
	            12,  // RTX 4070
	            12,  // RTX 4070 Ti
	            16,  // RTX 4070 TiS
	            16,  // RTX 4080
	            16,  // RTX 4080 S
	            24,  // RTX 4090
	            24   // RTX 4090 D
	    };

	        // 将显卡数据初始化到 GPU 数组中
	        for (int i = 0; i < gpus.length; i++) {
	            gpus[i] = new GPU(gpuNames[i], gpuMemory[i]);
	     }

	        // 打印排序前的显卡信息
	        System.out.println("排序前的显卡显存：");
	        for (GPU gpu : gpus) {
	            System.out.println(gpu);
	   }

	        // 冒泡排序：按显存从大到小排序
	        for (int i = 0; i < gpus.length - 1; i++) {
	            for (int j = 0; j < gpus.length - 1 - i; j++) {
	                if (gpus[j].getMemory() < gpus[j + 1].getMemory()) {
	                    // 交换显卡
	                    GPU temp = gpus[j];
	                    gpus[j] = gpus[j + 1];
	                    gpus[j + 1] = temp;
	   }
	   }
	     }

	        // 打印排序后的显卡信息
	        System.out.println("\n排序后的显卡显存：");
	        for (GPU gpu : gpus) {
	            System.out.println(gpu);
	        }
	    }
	}

}
