package model.logic;

public class Comparendo 
{
	private int objective;
	private String fecha_hora;
	private String medio_dete;
	private String clase_vehi;
	private String tipo_servi;
	private String infraccion;
	private String des_infrac;
	private String localidad;
	private double[] cordenadas;
	
	public Comparendo(int pObjective, String pFecha_hora, String pMedio_dete, String pClase_vehi, String pTipo_servi, String pInfraccion, String pDes_infrac, String pLocalidad, double pCordenada1, double pCordenada2) 
	{
		this.objective = pObjective;
		this.fecha_hora = pFecha_hora;
		this.medio_dete = pMedio_dete;
		this.clase_vehi = pClase_vehi;
		this.tipo_servi = pTipo_servi;
		this.infraccion = pInfraccion;
		this.des_infrac = pDes_infrac;
		this.localidad = pLocalidad;
		cordenadas = new double[2];
		cordenadas[0] = pCordenada1;
		cordenadas[1] = pCordenada2;
	}
	
	public int getObjective() 
	{
		return objective;
	}
	
	public void setObjective(int objective) 
	{
		this.objective = objective;
	}
	
	public String getFecha_hora() 
	{
		return fecha_hora;
	}
	
	public void setFecha_hora(String fecha_hora) 
	{
		this.fecha_hora = fecha_hora;
	}
	public String getMedio_dete() 
	{
		return medio_dete;
	}
	
	public void setMedio_dete(String medio_dete) 
	{
		this.medio_dete = medio_dete;
	}
	
	public String getClase_vehi() 
	{
		return clase_vehi;
	}
	
	public void setClase_vehi(String clase_vehi) 
	{
		this.clase_vehi = clase_vehi;
	}
	
	public String getTipo_servi()
	{
		return tipo_servi;
	}
	
	public void setTipo_servi(String tipo_servi) 
	{
		this.tipo_servi = tipo_servi;
	}
	
	public String getInfraccion() 
	{
		return infraccion;
	}
	
	public void setInfraccion(String infraccion) 
	{
		this.infraccion = infraccion;
	}
	
	public String getDes_infrac() 
	{
		return des_infrac;
	}
	
	public void setDes_infrac(String des_infrac) 
	{
		this.des_infrac = des_infrac;
	}
	
	public String getLocalidad() 
	{
		return localidad;
	}
	
	public void setLocalidad(String localidad) 
	{
		this.localidad = localidad;
	}
	
	public double[] getCordenadas() 
	{
		return cordenadas;
	}
	
	public void setCordenadas(double[] cordenadas) 
	{
		this.cordenadas = cordenadas;
	}
}
