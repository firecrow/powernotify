import { useFonts } from 'expo-font';
import { useEffect } from 'react';
import 'react-native-reanimated';
import React from 'react';
import {View, Text, Button, NativeModules} from 'react-native';
const {AppListModule} = NativeModules;

import { useColorScheme } from '@/hooks/useColorScheme';

export default function RootLayout() {
  const colorScheme = useColorScheme();
  const [loaded] = useFonts({
    SpaceMono: require('../assets/fonts/SpaceMono-Regular.ttf'),
  });

  const onPress = () => {
    AppListModule.getApps((apps:Map<String, any>) => {
      console.log("Apps found", apps)
    });
  }

  useEffect(() => {
  }, [loaded]);

  if (!loaded) {
    return null;
  }

  return (
    <View
    style={{
      flexDirection: 'column',
      height: 100,
      padding: 20,
    }}>
    <Text>Hi there</Text>
    <Button title="Click Me!" onPress={onPress} />
  </View>
  );
}
