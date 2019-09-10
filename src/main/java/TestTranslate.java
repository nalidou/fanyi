import com.swjtu.lang.LANG;
import com.swjtu.querier.Querier;
import com.swjtu.trans.AbstractTranslator;
import com.swjtu.trans.impl.*;
import com.swjtu.tts.AbstractTTS;
import com.swjtu.tts.impl.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class TestTranslate {

	public static void main(String[] args) throws Exception{
		// TTS
//		Querier<AbstractTTS> querierTTS = new Querier<AbstractTTS>();
//		querierTTS.setParams(LANG.EN, "To be or not to be, that is a question.");
//
//		querierTTS.attach(new BaiduTTS());
//		querierTTS.attach(new YoudaoTTS());
//		querierTTS.attach(new GoogleTTS());
//		querierTTS.attach(new TencentTTS());
//		querierTTS.attach(new SogouTTS());
//
//		List<String> resultTTS = querierTTS.execute();
//		for (String str : resultTTS) {
//			System.out.println(str);
//		}

		Scanner in = new Scanner(System.in);
		String line = in.nextLine();

		// translator
		Querier<AbstractTranslator> querierTrans = new Querier<AbstractTranslator>();
		querierTrans.setParams(LANG.ZH, LANG.JP,line);

		//querierTrans.attach(new BaiduTranslator());
		//querierTrans.attach(new YoudaoTranslator());
		querierTrans.attach(new GoogleTranslator());
		//querierTrans.attach(new TencentTranslator());
		//querierTrans.attach(new OmiTranslator());
		//querierTrans.attach(new TrycanTranslator());
		//querierTrans.attach(new IcibaTranslator());
		//querierTrans.attach(new SogouTranslator());

		List<String> resultTrans = querierTrans.execute();
		for (String str : resultTrans) {
			System.out.println(str);
		}

	}

}
