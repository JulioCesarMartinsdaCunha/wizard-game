package net.setafac.util;

public class BasicTool
{
    public static void ConsoleClear()
    {
        String osName = System.getProperty("os.name");
        try
        {
            String clearCommand = osName.toLowerCase().contains("windows") ? "cls" : "clear";
            Runtime.getRuntime().exec(clearCommand);
        }
        catch(Exception ex)
        {
            System.out.println("Ocorreu um erro ao tentar limpar console! Erro: " + ex.getMessage());
        }
    }

    public static void SpawnFunc(int timeInSeconds, Runnable function)
    {
        new Thread(() -> {
            try
            {
                Thread.sleep(timeInSeconds);
                function.run();
            }
            catch(Exception ex)
            {
                System.out.println("Erro ao tentar executar função passada! Erro: "+ex.getMessage());
            }
        }).start();
    }
}
