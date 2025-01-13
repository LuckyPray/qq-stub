package com.qq.taf.jce;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 格式化输出jce结构的所有属性
 * 主要用于调试或打日志
 * @author meteorchen
 *
 */
public final class JceDisplayer
{
	private final StringBuilder	sb;
	private int				_level = 0;
	
	private void ps(String fieldName)
	{
		for(int i = 0; i < _level; ++i)
			sb.append('\t');
		if(fieldName != null)
			sb.append(fieldName).append(": ");
	}
	
	public JceDisplayer(StringBuilder sb, int level)
	{
		this.sb = sb;
		this._level = level;
	}
	
	public JceDisplayer(StringBuilder sb)
	{
		this.sb = sb;
	}

	public JceDisplayer display(boolean b, String fieldName)
	{
		ps(fieldName);
		sb.append(b ? 'T' : 'F').append('\n');
		return this;
	}

	public JceDisplayer displaySimple(boolean b, boolean bSep)
	{
		sb.append(b ? 'T' : 'F');
		if(bSep) {
			sb.append("|");
		}
		return this;
	}
	
	public JceDisplayer display(byte n, String fieldName)
	{
		ps(fieldName);
		sb.append(n).append('\n');
		return this;
	}
	
	public JceDisplayer displaySimple(byte n, boolean bSep)
	{
		sb.append(n);
		if(bSep) {
			sb.append("|");
		}		
		return this;
	}
		
	public JceDisplayer display(char n, String fieldName)
	{
		ps(fieldName);
		sb.append(n).append('\n');
		return this;
	}
	
	public JceDisplayer displaySimple(char n, boolean bSep)
	{
		sb.append(n);
		if(bSep) {
			sb.append("|");
		}				
		return this;
	}	

	public JceDisplayer display(short n, String fieldName)
	{
		ps(fieldName);
		sb.append(n).append('\n');
		return this;
	}
	
	public JceDisplayer displaySimple(short n, boolean bSep)
	{
		sb.append(n);
		if(bSep) {
			sb.append("|");
		}						
		return this;
	}	

	public JceDisplayer display(int n, String fieldName)
	{
		ps(fieldName);
		sb.append(n).append('\n');
		return this;
	}
	
	public JceDisplayer displaySimple(int n, boolean bSep)
	{
		sb.append(n);
		if(bSep) {
			sb.append("|");
		}						
		return this;
	}	

	public JceDisplayer display(long n, String fieldName)
	{
		ps(fieldName);
		sb.append(n).append('\n');
		return this;
	}
	
	public JceDisplayer displaySimple(long n, boolean bSep)
	{
		sb.append(n);
		if(bSep) {
			sb.append("|");
		}								
		return this;
	}	

	public JceDisplayer display(float n, String fieldName)
	{
		ps(fieldName);
		sb.append(n).append('\n');
		return this;
	}
	
	public JceDisplayer displaySimple(float n, boolean bSep)
	{
		sb.append(n);
		if(bSep) {
			sb.append("|");
		}										
		return this;
	}	

	public JceDisplayer display(double n, String fieldName)
	{
		ps(fieldName);
		sb.append(n).append('\n');
		return this;
	}
	
	public JceDisplayer displaySimple(double n, boolean bSep)
	{
		sb.append(n);
		if(bSep) {
			sb.append("|");
		}												
		return this;
	}	

	public JceDisplayer display(String s, String fieldName)
	{
		ps(fieldName);
		if (null == s ) {
			sb.append("null").append('\n');
		} else {
			sb.append(s).append('\n');
		}
		
		return this;
	}
	
	public JceDisplayer displaySimple(String s, boolean bSep)
	{
		if (null == s ) {
			sb.append("null");
		} else {
			sb.append(s);
		}
		if(bSep) {
			sb.append("|");
		}														
		return this;
	}	
	
	public JceDisplayer display(byte[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(byte o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public JceDisplayer displaySimple(byte[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			if(bSep) {
				sb.append("|");
			}																	
			return this;
		}
		
		sb.append(HexUtil.bytes2HexStr(v));
		if(bSep) {
			sb.append("|");
		}																			
		return this;
	}
		
	public JceDisplayer display(char[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(char o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public JceDisplayer displaySimple(char[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			if(bSep) {
				sb.append("|");
			}																			
			return this;
		}

		sb.append(new String(v));
		if(bSep) {
			sb.append("|");
		}																					
		return this;
	}
	
	
	public JceDisplayer display(short[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(short o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public JceDisplayer displaySimple(short[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			sb.append("[]");
			if(bSep) {
				sb.append("|");
			}																								
			return this;
		}
		sb.append("[");
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(int i = 0; i < v.length; i++) {
			short o = v[i];
			if(i != 0) {
				sb.append("|");				
			}
			jd.displaySimple(o, false);
		}
		sb.append("]");
		if(bSep) {
			sb.append("|");				
		}
		
		return this;
	}
	
	
	public JceDisplayer display(int[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(int o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public JceDisplayer displaySimple(int[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			sb.append("[]");
			if(bSep) {
				sb.append("|");
			}																											
			return this;
		}
		sb.append("[");
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(int i = 0; i < v.length; i++) {
			int o = v[i];
			if(i != 0) {
				sb.append("|");								
			}
			jd.displaySimple(o, false);
		}
		sb.append("]");
		if(bSep) {
			sb.append("|");
		}																													
		return this;
	}
	
	
	public JceDisplayer display(long[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(long o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public JceDisplayer displaySimple(long[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			sb.append("[]");
			if(bSep) {
				sb.append("|");
			}																											
			return this;
		}
		sb.append("[");
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(int i = 0; i < v.length; i++) {
			long o = v[i];
			if(i != 0) {
				sb.append("|");				
			}
			jd.displaySimple(o, false);
		}
		sb.append("]");
		if(bSep) {
			sb.append("|");				
		}
		
		return this;
	}
	
	
	public JceDisplayer display(float[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(float o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public JceDisplayer displaySimple(float[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			sb.append("[]");
			if(bSep) {
				sb.append("|");				
			}
			return this;
		}
		sb.append("[");
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(int i = 0; i < v.length; i++) {
			float o = v[i];
			if(i != 0) {
				sb.append("|");								
			}
			jd.displaySimple(o, false);
		}
		sb.append("]");
		if(bSep) {
			sb.append("|");				
		}		
		return this;
	}
	
	
	public JceDisplayer display(double[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(double o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public JceDisplayer displaySimple(double[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			sb.append("[]");
			if(bSep) {
				sb.append("|");				
			}			
			return this;
		}
		sb.append("[");
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(int i = 0; i < v.length; i++) {
			double o = v[i];
			if(i != 0) {
				sb.append("|");
			}
			jd.displaySimple(o, false);
		}
		sb.append("[");
		if(bSep) {
			sb.append("|");			
		}
		return this;
	}
	
	
	public <K, V> JceDisplayer display(Map<K, V> m, String fieldName)
	{
		ps(fieldName);
		if (null == m ) {
			sb.append("null").append('\n');
			return this;
		}
		if(m.isEmpty()){
			sb.append(m.size()).append(", {}").append('\n');
			return this;
		}
		sb.append(m.size()).append(", {").append('\n');
		JceDisplayer jd1 = new JceDisplayer(sb, _level + 1);
		JceDisplayer jd = new JceDisplayer(sb, _level + 2);
		for(Map.Entry<K, V> en : m.entrySet()){
			jd1.display('(', null);
			jd.display(en.getKey(), null);
			jd.display(en.getValue(), null);
			jd1.display(')', null);
		}
		display('}', null);
		return this;
	}
	
	public <K, V> JceDisplayer displaySimple(Map<K, V> m, boolean bSep)
	{
		if (null == m || m.isEmpty()) {
			sb.append("{}");
			if(bSep) {
				sb.append("|");				
			}						
			return this;
		}

		sb.append("{");
		JceDisplayer jd = new JceDisplayer(sb, _level + 2);
		boolean first = true;
		for(Map.Entry<K, V> en : m.entrySet()){
			if(!first) {
				sb.append(",");				
			}
			jd.displaySimple(en.getKey(), true);
			jd.displaySimple(en.getValue(), false);
			first = false;
		}
		sb.append("}");
		if(bSep) {
			sb.append("|");			
		}		
		return this;
	}	
	
	public <T> JceDisplayer display(T[] v, String fieldName)
	{
		ps(fieldName);
		if (null == v ) {
			sb.append("null").append('\n');
			return this;
		}
		if(v.length == 0){
			sb.append(v.length).append(", []").append('\n');
			return this;
		}
		sb.append(v.length).append(", [").append('\n');
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(T o : v)
			jd.display(o, null);
		display(']', null);
		return this;
	}
	
	public <T> JceDisplayer displaySimple(T[] v, boolean bSep)
	{
		if (null == v || v.length == 0) {
			sb.append("[]");
			if(bSep) {
				sb.append("|");				
			}									
			return this;
		}

		sb.append("[");
		JceDisplayer jd = new JceDisplayer(sb, _level + 1);
		for(int i = 0 ; i < v.length; i++) {
			T o = v[i];
			if(i != 0) {
				sb.append("|");							
			}
			jd.displaySimple(o, false);
		}
		sb.append("]");
		if(bSep) {
			sb.append("|");			
		}		
		return this;
	}	

	public <T> JceDisplayer display(Collection<T> v, String fieldName)
	{
		if (null == v ) {
			ps(fieldName);
			sb.append("null").append('\t');
			return this;
		} else {
			return display(v.toArray(), fieldName);
		}		
	}
	
	public <T> JceDisplayer displaySimple(Collection<T> v, boolean bSep)
	{
		if (null == v ) {
			sb.append("[]");
			if(bSep) {
				sb.append("|");				
			}												
			return this;
		} else {
			return displaySimple(v.toArray(), bSep);
		}		
	}
	
	
	@SuppressWarnings("unchecked")
	public <T> JceDisplayer display(T o, String fieldName)
	{
		if (null == o ) {
			sb.append("null").append('\n');
		} else if(o instanceof Byte){
			display(((Byte) o).byteValue(), fieldName);
		}else if(o instanceof Boolean){
			display(((Boolean) o).booleanValue(), fieldName);
		}else if(o instanceof Short){
			display(((Short) o).shortValue(), fieldName);
		}else if(o instanceof Integer){
			display(((Integer) o).intValue(), fieldName);
		}else if(o instanceof Long){
			display(((Long) o).longValue(), fieldName);
		}else if(o instanceof Float){
			display(((Float) o).floatValue(), fieldName);
		}else if(o instanceof Double){
			display(((Double) o).doubleValue(), fieldName);
		}else if(o instanceof String){
			display((String) o, fieldName);
		}else if(o instanceof Map){
			display((Map) o, fieldName);
		}else if(o instanceof List){
			display((List) o, fieldName);
		}else if(o instanceof JceStruct){
			display((JceStruct) o, fieldName);
		} else if (o instanceof byte[]) {
			display((byte[])o, fieldName);
		} else if (o instanceof boolean[]) {
			display((boolean[])o, fieldName);
		} else if (o instanceof short[]) {
			display((short[])o, fieldName);
		} else if (o instanceof int[]) {
			display((int[])o, fieldName);
		} else if (o instanceof long[]) {
			display((long[])o, fieldName);
		} else if (o instanceof float[]) {
			display((float[])o, fieldName);
		} else if (o instanceof double[]) {
			display((double[])o, fieldName);
		} else if (o.getClass().isArray()) {
			display((Object[])o, fieldName);
		}else{
			throw new JceEncodeException("write object error: unsupport type.");
		}
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public <T> JceDisplayer displaySimple(T o, boolean bSep)
	{
		if (null == o ) {
			sb.append("null").append('\n');
		} else if(o instanceof Byte){
			displaySimple(((Byte) o).byteValue(), bSep);
		}else if(o instanceof Boolean){
			displaySimple(((Boolean) o).booleanValue(), bSep);
		}else if(o instanceof Short){
			displaySimple(((Short) o).shortValue(), bSep);
		}else if(o instanceof Integer){
			displaySimple(((Integer) o).intValue(), bSep);
		}else if(o instanceof Long){
			displaySimple(((Long) o).longValue(), bSep);
		}else if(o instanceof Float){
			displaySimple(((Float) o).floatValue(), bSep);
		}else if(o instanceof Double){
			displaySimple(((Double) o).doubleValue(), bSep);
		}else if(o instanceof String){
			displaySimple((String) o, bSep);
		}else if(o instanceof Map){
			displaySimple((Map) o, bSep);
		}else if(o instanceof List){
			displaySimple((List) o, bSep);
		}else if(o instanceof JceStruct){
			displaySimple((JceStruct) o, bSep);
		} else if (o instanceof byte[]) {
			displaySimple((byte[])o, bSep);
		} else if (o instanceof boolean[]) {
			displaySimple((boolean[])o, bSep);
		} else if (o instanceof short[]) {
			displaySimple((short[])o, bSep);
		} else if (o instanceof int[]) {
			displaySimple((int[])o, bSep);
		} else if (o instanceof long[]) {
			displaySimple((long[])o, bSep);
		} else if (o instanceof float[]) {
			displaySimple((float[])o, bSep);
		} else if (o instanceof double[]) {
			displaySimple((double[])o, bSep);
		} else if (o.getClass().isArray()) {
			displaySimple((Object[])o, bSep);
		}else{
			throw new JceEncodeException("write object error: unsupport type.");
		}
		return this;
	}
	

	public JceDisplayer display(JceStruct v, String fieldName)
	{
		display('{', fieldName);
		if (null == v ) {
			sb.append('\t').append("null");
		} else {
			v.display(sb, _level + 1);
		}
		
		display('}', null);
		return this;
	}
	
	public JceDisplayer displaySimple(JceStruct v, boolean bSep)
	{
		sb.append("{");
		if (null == v ) {
			sb.append('\t').append("null");
		} else {
			v.displaySimple(sb, _level + 1);
		}
		sb.append("}");
		if(bSep) {
			sb.append("|");				
		}														
		return this;
	}
	

	public static void main(String[] args)
	{
        System.out.println("1.2");
	}
}
