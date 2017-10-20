package com.fino.aotodemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {
//private AutoCompleteTextView acTextView;
	private String [] res={"beijing1","beijing2","beijing3","shanghai1","shanghai2"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AutoCompleteTextView acTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
	/**
	 * 第一步  初始化控件
	 *第二部   需要一个适配器
	 * 第三部   初始化数据源 这个数据源去匹配文本框输入的内容
	 * 第四部  将adapter与当前的AutoCompleteTextView绑定
	 */
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, 
				   android.R.layout.simple_list_item_1, res);
		acTextView.setAdapter(adapter);
		
		/**
		 * 第一步  初始化控件
		 *第二部   需要一个适配器
		 * 第三部   初始化数据源 这个数据源去匹配文本框输入的内容
		 * 第四部  将adapter与当前的AutoCompleteTextView绑定
		 * 第五部  设置分隔符
		 */
		
		MultiAutoCompleteTextView  macTextView=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
 //设置以逗号为分隔符为结束的符号
		//macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		macTextView.setTokenizer(new SemicolonTokenizer(';'));
		macTextView.setAdapter(adapter);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
