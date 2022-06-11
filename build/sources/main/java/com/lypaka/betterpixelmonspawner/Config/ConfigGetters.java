package com.lypaka.betterpixelmonspawner.Config;

import com.google.common.reflect.TypeToken;
import ninja.leaping.configurate.objectmapping.ObjectMappingException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConfigGetters {

    public static boolean pokeClearEnabled;
    public static int pokeClearInterval;
    public static String pokeClearMessage;
    public static List<String> blacklistedClearPokemon;
    public static int clearWarningInterval;
    public static String clearWarningMessage;
    public static List<String> worldBlacklist;

    public static double alphaSpawnChance;
    public static boolean bossesCanBeNormal;
    public static double bossSpawnChance;
    public static Map<String, Double> bossSpawnMap;
    public static boolean generateFiles;
    public static double gmaxChance;
    public static boolean marksEnabled;
    public static int maxPokemon;
    public static String highIVSoundID;
    public static double aggressiveChance;
    public static List<String> blacklistedSpawnPokemon;
    public static boolean removeEternatus;
    public static boolean removeLegendariesFromNormalSpawner;
    public static boolean removeMeltan;
    public static boolean spawnerEnabled;
    public static int spawnInterval;
    public static int xzRadius;
    public static int yRadius;
    public static double totemSpawnChance;
    public static boolean validateSpawns;

    public static boolean legendarySpawnerEnabled;
    public static double legendarySpawnChance;
    public static boolean legendarySpawnFilterEnabled;
    public static int legendarySpawnLocationXZ;
    public static int legendarySpawnLocationY;
    public static int legendaryGracePeriod;
    public static int legendarySpawnInterval;
    public static String legendarySpawnMessage;
    public static boolean legendarySpawnsGlowing;
    public static List<String> specialLegendaries;

    public static int npcDespawnTimer;
    public static boolean npcSpawnerEnabled;
    public static int maxNPCs;
    public static int npcSpawnInterval;
    public static int npcSpawnLocationXZ;
    public static Map<String, Double> npcSpawnMap;
    public static boolean unsafeSpawnLocations;

    public static int miscDespawnTimer;
    public static boolean miscSpawnerEnabled;
    public static int maxMiscEntities;
    public static int miscEntityInterval;
    public static int miscRadiusXZ;
    public static Map<String, Double> miscEntitySpawnMap;
    public static boolean unsafeMiscSpawnLocations;

    public static double particleChance;
    public static String holidaySpawnMessage;
    public static double textureChance;

    public static List<String> legendaryOptOut;
    public static List<String> miscOptOut;
    public static List<String> npcOptOut;
    public static List<String> pokemonOptOut;

    public static void load() throws ObjectMappingException {

        pokeClearEnabled = ConfigManager.getConfigNode(0, "PokeClear", "Enabled").getBoolean();
        pokeClearInterval = ConfigManager.getConfigNode(0, "PokeClear", "Interval").getInt();
        pokeClearMessage = ConfigManager.getConfigNode(0, "PokeClear", "Message").getString();
        blacklistedClearPokemon = ConfigManager.getConfigNode(0, "PokeClear", "Pokemon-Blacklist").getList(TypeToken.of(String.class));
        clearWarningInterval = ConfigManager.getConfigNode(0, "PokeClear", "Warning-Interval").getInt();
        clearWarningMessage = ConfigManager.getConfigNode(0, "PokeClear", "Warning-Message").getString();
        //World-Blacklist
        worldBlacklist = ConfigManager.getConfigNode(0, "World-Blacklist").getList(TypeToken.of(String.class));

        particleChance = ConfigManager.getConfigNode(1, "General-Settings", "Particle-Chance").getDouble();
        holidaySpawnMessage = ConfigManager.getConfigNode(1, "General-Settings", "Spawn-Message").getString();
        textureChance = ConfigManager.getConfigNode(1, "General-Settings", "Texture-Chance").getDouble();

        alphaSpawnChance = ConfigManager.getConfigNode(2, "Alpha-Spawn-Chance").getDouble();
        bossesCanBeNormal = ConfigManager.getConfigNode(2, "Bosses-Can-Be-Normals").getBoolean();
        bossSpawnChance = ConfigManager.getConfigNode(2, "Boss-Spawn-Chance").getDouble();
        bossSpawnMap = ConfigManager.getConfigNode(2, "Boss-Spawn-Map").getValue(new TypeToken<Map<String, Double>>() {});
        generateFiles = ConfigManager.getConfigNode(2, "Generate-Files").getBoolean();
        gmaxChance = ConfigManager.getConfigNode(2, "GMax-Factor-Chance").getDouble();
        marksEnabled = ConfigManager.getConfigNode(2, "Marks-Enabled").getBoolean();
        maxPokemon = ConfigManager.getConfigNode(2, "Max-Pokemon-Per-Player").getInt();
        highIVSoundID = ConfigManager.getConfigNode(2, "Play-High-IV-Sound").getString();
        aggressiveChance = ConfigManager.getConfigNode(2, "Pokemon-Aggressive").getDouble();
        blacklistedSpawnPokemon = ConfigManager.getConfigNode(2, "Pokemon-Blacklist").getList(TypeToken.of(String.class));
        removeEternatus = ConfigManager.getConfigNode(2, "Remove-Eternatus-From-Normal-Spawner").getBoolean();
        removeLegendariesFromNormalSpawner = ConfigManager.getConfigNode(2, "Remove-Legendaries-From-Normal-Spawner").getBoolean();
        removeMeltan = ConfigManager.getConfigNode(2, "Remove-Meltan-From-Normal-Spawner").getBoolean();
        spawnerEnabled = ConfigManager.getConfigNode(2, "Spawner-Enabled").getBoolean();
        spawnInterval = ConfigManager.getConfigNode(2, "Spawn-Interval").getInt();
        xzRadius = ConfigManager.getConfigNode(2, "Spawn-Location-XZ").getInt();
        yRadius = ConfigManager.getConfigNode(2, "Spawn-Location-Y").getInt();
        totemSpawnChance = ConfigManager.getConfigNode(2, "Totem-Spawn-Chance").getDouble();
        validateSpawns = ConfigManager.getConfigNode(2, "Validate-Spawns").getBoolean();

        legendarySpawnerEnabled = ConfigManager.getConfigNode(3, "Enabled").getBoolean();
        legendarySpawnChance = ConfigManager.getConfigNode(3, "Spawn-Chance").getDouble();
        legendarySpawnFilterEnabled = ConfigManager.getConfigNode(3, "Spawn-Filter-Enabled").getBoolean();
        legendaryGracePeriod = ConfigManager.getConfigNode(3, "Spawn-Grace-Period").getInt();
        legendarySpawnInterval = ConfigManager.getConfigNode(3, "Spawn-Interval").getInt();
        legendarySpawnLocationXZ = ConfigManager.getConfigNode(3, "Spawn-Location-XZ").getInt();
        legendarySpawnLocationY = ConfigManager.getConfigNode(3, "Spawn-Location-Y").getInt();
        legendarySpawnMessage = ConfigManager.getConfigNode(3, "Spawn-Message").getString();
        legendarySpawnsGlowing = ConfigManager.getConfigNode(3, "Spawn-Pokemon-Glowing").getBoolean();
        specialLegendaries = ConfigManager.getConfigNode(3, "Special-Spawns").getList(TypeToken.of(String.class));

        npcDespawnTimer = ConfigManager.getConfigNode(4, "Despawn-Timer").getInt();
        npcSpawnerEnabled = ConfigManager.getConfigNode(4, "Enabled").getBoolean();
        maxNPCs = ConfigManager.getConfigNode(4, "Max-NPCs").getInt();
        npcSpawnInterval = ConfigManager.getConfigNode(4, "Spawn-Interval").getInt();
        npcSpawnLocationXZ = ConfigManager.getConfigNode(4, "Spawn-Location-XZ").getInt();
        npcSpawnMap = ConfigManager.getConfigNode(4, "Spawn-Map").getValue(new TypeToken<Map<String, Double>>() {});
        unsafeSpawnLocations = ConfigManager.getConfigNode(4, "Unsafe-Spawn-Locations").getBoolean();

        miscDespawnTimer = ConfigManager.getConfigNode(5, "Despawn-Timer").getInt();
        miscSpawnerEnabled = ConfigManager.getConfigNode(5, "Enabled").getBoolean();
        maxMiscEntities = ConfigManager.getConfigNode(5, "Max-Entities").getInt();
        miscEntityInterval = ConfigManager.getConfigNode(5, "Spawn-Interval").getInt();
        miscEntitySpawnMap = ConfigManager.getConfigNode(5, "Spawn-Map").getValue(new TypeToken<Map<String, Double>>() {});
        unsafeMiscSpawnLocations = ConfigManager.getConfigNode(5, "Unsafe-Spawn-Locations").getBoolean();

        legendaryOptOut = new ArrayList<>(ConfigManager.getConfigNode(6, "Legendary-Opt-Out").getList(TypeToken.of(String.class)));
        miscOptOut = new ArrayList<>(ConfigManager.getConfigNode(6, "Misc-Opt-Out").getList(TypeToken.of(String.class)));
        npcOptOut = new ArrayList<>(ConfigManager.getConfigNode(6, "NPC-Opt-Out").getList(TypeToken.of(String.class)));
        pokemonOptOut = new ArrayList<>(ConfigManager.getConfigNode(6, "Pokemon-Opt-Out").getList(TypeToken.of(String.class)));

    }

}