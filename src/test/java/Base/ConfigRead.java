package Base;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * интерфейс для чтения ресурсов в формате conf(typesafe java maven - выбираем Config)
 */
public interface ConfigRead {
   Config config = readConfig();

   static Config readConfig() {
      return ConfigFactory.load("conf.conf"); // метод указываыет путь для загркзки файла Conf
   }

   String DRIVER_NAME = config.getString("driverName");
   String URL = config.getString("url");
   String CROME_DRIVER_PATH = config.getString("chromeDriverPath");
   String SEARCH = config.getString("search");
   String PASSED = config.getString("passed");

}