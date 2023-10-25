package Base;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Интерфейс для чтения ресурсов в формате conf(typesafe java maven - выбираем Config)
 */
public interface ConfigRead {
   Config config = readConfig();

   static Config readConfig(){
       return ConfigFactory.load("conf.conf"); // метод указываыет путь для загркзки файла Conf
   }

   String DRIVER_NAME = readConfig().getString("driverName");
   String URL = readConfig().getString("url");
   String CROME_DRIVER_PATH = readConfig().getString("chromeDriverPath");
}
